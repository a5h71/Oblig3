
# Oblig3

### Github Actions setup:

>__Step 1__: Upload project through InelliJ 

<img src="src/main/resources/Gitupload.png" width="300" length="200">


>__Step 2__: Click on Actions button and choose 

<img src="src/main/resources/actions.png">

>__Step 3__: Change the JDK in the mave.yml file
<img src="src/main/resources/jdk.png">

>__Step 4__: Under the Actions tab, the logs of the build will show. 
<img src="src/main/resources/actionsTab.png">

>Although everything was building without issues, I noticed the tests weren't running once I clicked the build.
<img src="src/main/resources/NoTest.png">

>__Step 5__: To automate testing, added the following to the pom.xml file
<img src="src/main/resources/dependency.png">

> All the tests are running now after a new commit
<img src="src/main/resources/TestResults.png">
