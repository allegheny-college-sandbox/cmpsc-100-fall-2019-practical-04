# CMPSC 100-03 Practical Session 4

In this practical session, we address a real problem in the world of gators: minimizing the amount of coins returned as change when a gator buys something. Generally, gators can grasp onto or chomp paper currency, but coins prove a little harder to manage. Let's make it easy on G. Wiz and his friends by helping cashiers give back as few coins as possible.

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
* [Minizing the gator's coins: an optimization problem](#minimizing-the-gators-coins--an-optimization-problem)

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

When we write the word "optimization," what we're up to is somehow maximizing/minimizing one factor such that it either cannot be increased/decreased any more or creates an ideal set of conditions. Here, we're concerned with minimization.

### 