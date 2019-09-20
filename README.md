# CMPSC 100-03 Practical Session 4

In this practical session, we address a real problem in the world of gators: minimizing the amount of coins returned as change when a gator buys something. Generally, gators can grasp onto or chomp paper currency, but coins prove a little harder to manage (hint: because "no thumbs"). Let's make it easy on G. Wiz and his friends by helping cashiers give back as few coins as possible.

(Note: it is strange, but the gator world uses a system of currency _exactly_ like that of the human world.)

Along the way, we're going to explore using a couple more `assignment operators`, in this case, `-=` and `+=`.

* Assigned: Friday, 20 September 2019
* Due: Monday, 23 September 2019
* Point value: 10 points

# General guidelines for practical sessions

* **Experiment!** We design practical sessions to create a space for you to _try things_. Given the expertise of our classroom TLs and my interest in fixing stuff, I am sure that even if something breaks, we can fix it.
* **Complete _something_.** Grading for practical assignments hinges on _completion_. As long as you provide a good faith effort to finish a task, your grade should reflect your effort.
* **Practice skills.** If you work in the discipline of computer science, many of the skills you revisit or establish here are industry standard practice. Learning and practicing them often helps prepare you for either other classes or professional work.
* **Try to finish during the class session** While I provide extra time to complete the work, these assignments can be completed in 50 minutes. This will help you develop your awareness and management of time.
* **Help one another!** We're a community of users here, not competitors. If you grasp something quickly, but a neighbor does not, offer to help them after they've tried for a bit. Conversely, _ask for help_ from either me, our lab TLs, or your neighbor.

## Table of Contents

* [Cloning your repository](#cloning-your-repository)
* [Slack](#slack)
* [Github](#github)
* [Minizing the gator's coins: an optimization problem](#minimizing-the-gators-coins-an-optimization-problem)

## Cloning your repository

- [ ] Open a terminal window. Keep this window open during all of today's assignment.
- [ ] Add your SSH key to your terminal session so that you can prove your identity to GitHub.
- [ ] In your terminal window, type `eval "$(ssh-agent -s)"` and press `Enter` to start the SSH Agent `process`
- [ ] Next, add your key. Type `ssh-add ~/.ssh/id_rsa`
* You may need to provide your password.

## Slack

Before beginning the practical session, log into our shared [Slack](https://cmpsc100Fall2019.slack.com) workspace and navigate to the `#practicals` channel. Remain in this channel for the duration of the session to accept the assignment and ask and answer questions.

## GitHub

An individualized version of this assignment is available on our GitHub Classroom platform. The link for accepting your individual repository is in the `#practicals` channel of our [Slack](#slack).

## Minimizing the gator's coins: an optimization problem

When we write the word "optimization" here, we're up to somehow maximizing/minimizing one factor such that it either cannot be increased/decreased any more without changing output.

### The given situation

You've been given starter code that does some of the more difficult things we haven't yet discussed in class. It's safe to say that all of this belongs to the program, and shouldn't be removed.

Of particular note are the following lines:

```java
    /* 
     * Accept 1 argument as a double, turn it into an integer;
     * multiply by 100 to get the value in cents, rather than
     * dollars. Currency being base 10 is wonderful.
     */
    int inputValue;
    int totalCents;
    inputValue = totalCents = (int)(Double.parseDouble(args[0]) * 100);
    /*
     * Because we only care about the coins, remove the amount
     * of dollar bills required.
     */
    int dollars = totalCents / 100;
    totalCents -= dollars * 100;
    /*
     * "Initialize," or "create" the variable which will hold the
     * number of coins required at any given step.
     */
    int totalCoins = 0;
```

Here, the program starts by accepting a command-line argument (in `args`) that is of the `double` type. You may be surprised to know that we can change variable types! Here, we're taking in the `double`, but making it an `int` with the `(int)` part of the expression. Multiplying the `double` before converting it to an `int` guarantees we have the most precise integer version of the `double` in cents, rather than a decimal. (The value in cents will always be a whole number, this way.) This is all loaded into `totalCents`.

Next, we only care about the coins, so any amount representing whole dollars doesn't matter here. The below code takes care of that:

```java
int dollars = totalCents / 100;
totalCents -= dollars * 100;
```

This divides the amount of `totalCents` by, essentially, 100 cents (100 cents = 1 dollar) and stores it in the `dollar` variable. Then, the next expression uses the `-=` operator to subtract that value (in cents) from our `totalCents` variable to update the amount of money available for the next step.

But, first, we have to "initialize" (or "define") `totalCoins`, the variable we're going to use to track how many coins are in use. We give it he `int` type because it, too, should be a whole number, and set it to `0`, thereby "initializing" it.

The rest is up to you!

* **Hint:** take a look at how we assign the `dollars` variable. How might you reuse this idea to represent quarters? Dimes? Nickels? Pennies?

### The finished product

- [ ] A single file, `MinCoins.java` which builds and runs successfully (use `gradle run --args="1.23"` for our test case in this practical)
- [ ] Implements variables to track: `quarters`, `dimes`, `nickels`, `pennies`, and `totalCoins` (a measure of how many coins are used)
- [ ] Uses the `+=` and `-=` operators to modify values `totalCoins` and `totalCents` according to how these values increase or decrease over time
- [ ] Prints the original value as a `double`
- [ ] Prints the amount of coins necessary on a single line, preceded by descriptive text
- [ ] Prints the amount of each denomination of coin on a separate line formatted with tab characters so that all of the numbers line up:
```
Value:          1.23
Minimum Coins:  5
Quarters:       0
Dimes:          2
Nickels:        0
Pennies:        3

```
* **Hint:** This uses a control character
* **Note:** program output should look like the above.
- [ ] Removes all `TODO` statement and replaces any other `{}` placeholders.

## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it:

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] In a terminal, ensure you're in the main folder of your practical repository and type `gradle build`
- [ ] After the `command` completes successfully, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`
