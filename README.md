# SPE_mini_project
This is the github repo for the spe mini project, scientific calculator in java and CI/CD pipeline using jenkins.

### 1. About all the files

1. Dockerfile -  This file is reponsible for creating our calculator image from openjdk-11 base image.
2. Jenkinsfile - This is the heart of the pipeline. Jenkinsfile is where we write all our pipeline scripts, stages and steps, to be executed to get a CI/CD pipeline for our mini project.
3. Inventory - The inventory file is where we mention our ansible host machines in which we want to deploy our image and run the containers.
4. plybk.yml - In this file, we write all the deployment steps, what we want to do with our host machines, i.e., pull image from dockerhub -> remove previous versions of images and containers -> run a new container with latest image.

NOTE - The inv file contains my local deployment servers while the inventory file contains my remote deoployment server. But this is not a good way, we can put these in a single file. The thing is, we can create groups in the inventory file itself for adding local servers and remote servers separately and access them using their groups.

for eg. - we can create two server groups as

[localServers]
... list of local servers

[remoteServers]
... list of remote servers

5. copy_logs.sh - This is a shell script written to copy log files from the container in the local machine's Downloads directory. I have decided to run this as a script as i have to change the owner permission as well after "docker cp" , which if not done, wont't allow me to upload log file into elastic search. So i have written a sequence of commands to be executed after copying the log file.


### 2. How to run the entire project?

For this I have prepared an entire documentation of the project. Step by step instructions of setup and running the project.
Resolving errors which I have faced during development alonf with screenshots.
Please refer to the pdf I am sharing with you all  - 
[SPE Mini Project Documentation PDF](https://iiitbac-my.sharepoint.com/:b:/g/personal/kantimahanty_rohit_iiitb_ac_in/ESe9-fPLeppCl_U1mj84-RkBxFgL_0sa7ktpIGdnpUySqQ?e=8XPZcL)
