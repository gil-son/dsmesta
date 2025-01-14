# dsmeta
Spring React Project of the Week

## About event

<p> SDS9 is an event promoted by <a href="https://devsuperior.com.br/"> DevSuperior <a/> which aims to
help students and programming professionals to enter or re-enter their careers.</p>

<p>That event improve abilities required to an Full Stack Developer build a system with a quality architecture!</p>


## About functionality

<p>
dsmeta is a project that stores salespeople with their sales data, visits, agreement, etc. It allows filtering by periods and allows you to send notifications to the registered cell phone with all the information of the selected seller.
</p>


## Installs


<details><summary>Windows</summary>

### SDS: Installing the tools on Windows

#### Tools you must install on your computer:

- JDK 17
- STS
- Postman
- Heroku CLI
- NodeJS 16.x (https://nodejs.org/en/download/)
- VS Code
- Git

## Youtube Playlist showing installation

https://www.youtube.com/playlist?list=PLNuUvBZGBA8kMTSPMmmNiRm2z0gRxXxox


</details>



<details><summary>Linux</summary>

### SDS: Installation of tools on Linux (Ubuntu/Debian)

#### Tools you must install on your computer:

- curl
- Git
- Java JDK 17
- Maven
- STS
- Postman
- Heroku CLI
- NodeJS 16.x (https://nodejs.org/en/download/)
- Yarn
- VS Code

## Playlist showing installation:

https://www.youtube.com/playlist?list=PLNuUvBZGBA8mcAF-YX7RJhA26TBLdG5yk

## curl

- Install curl
```
sudo apt-get install -y curl
```
- Check the installation:
```
curl
```

## Git

- Install:
```
sudo apt-get install -y git
```

- Check the installation:
```
git
```

## Java JDK 17

- Install Java:
```
sudo apt install openjdk-17-jdk
```

- Check installation:
```
java -version
```
- Configure JAVA_HOME:
  - Check Java path:
  ```
  sudo update-alternatives --config java
  ```
  - Edit the .bashrc file:
  ```
  sudo gedit ~/.bashrc
  ```
  - Copy the code below at the end of the file (note your JDK version). Save the file.
  ```
  JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
  export JAVA_HOME
  export PATH=$PATH:$JAVA_HOME
  ```
  - Open a new terminal and test:
  ```
  echo $JAVA_HOME
  ```

## Maven

- Install Maven:
```
sudo apt-get install maven
```
- Check installation:
```
mvn -v
```

## STS

- Google: STS
- To go down
- Unzip (example: /home/user/apps)
- Start STS
  - Select a workspace (example: /home/user/Workspaces/ws-sts)
- Release permission on the workspace folder:
```
sudo chmod -R ugo+rw /home/user/Workspaces/ws-sts
```

## Postman

- Install with snap:
```
snap install postman
```

## Heroku CLI

```
https://devcenter.heroku.com/articles/heroku-cli
```

## Node 16

```
sudo apt update

curl -sL https://deb.nodesource.com/setup_16.x | sudo -E bash -

sudo apt-get install nodejs
```

## YARN
On Debian and Ubuntu:
```
 curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | sudo apt-key add -
 
 echo "deb https://dl.yarnpkg.com/debian/ stable main" | sudo tee /etc/apt/sources.list.d/yarn.list
 
 sudo apt-get update && sudo apt-get install yarn

```
If you have installation problems, Yarn's own DOC is very useful: https://classic.yarnpkg.com/pt-BR/docs/install/#debian-stable

## VS Code

```
https://code.visualstudio.com/download

sudo snap install code --classic
```

</details>



<details><summary>Mac</summary>

### SDS: Installing the tools on Mac


#### Tools you must install on your computer:

- JDK 17
- STS
- Postman
- Heroku CLI
- NodeJS 16.x (https://nodejs.org/en/download/)
- VS Code
- Git

 ## Install Homebrew
```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)"
```
1. Update HomeBrew.
```
$ brew update
```
2. Add the casks tap.
```
$ brew tap homebrew/cask-versions
```

## Java 17 on MacOS
```
$ brew tap AdoptOpenJDK/openjdk
$ brew install --cask adoptopenjdk17
```

- Check installation:
```
$ java —version
```

## STS on MacOS
```
$ brew cask install springtoolsuite
```

## postman
```
$ brew cask install postman
```

## Heroku CLI
Create an account on the Heroku website
https://devcenter.heroku.com/articles/heroku-cli#getting-started
- Install heroku CLI
```
$ brew tap heroku/brew && brew install heroku
```
- Link your account with the installation on the computer
```
$ heroku autocomplete
```
- This command will open the login site, login with your username and password

## Node & NPM
```
$ brew install node
```

## YARN (If you want to use YARN instead of NPM)

```
$ brew install yarn
```

## VS Code

1. Download Visual Studio Code for macOS. https://go.microsoft.com/fwlink/?LinkID=534106
2. In Finder open the Downloads folder and locate the downloaded file.
3. Drag Visual Studio Code.app to the Applications folder so that it is available on macOS Launchpad.
5. Add VS Code to the Dock by right clicking on the icon and in the context menu select: Options, Keep in Dock.

## Git
```
$ brew install git
```

</details>



## Technical knowledge


<ul>
        <li><a href="https://youtu.be/xC_yKw3MYX4">OO and SQL<a/></li>
        <li><a href="https://youtu.be/os6hdZbCnpM">Jpa Repository</a></li>
        <li><a href="https://youtu.be/OX5MmJrFTdw">Domain Model<a/></li>
        <li><a href="https://youtu.be/IOJoJGDowEY">React JS<a/></li>
        <li><a href="https://youtu.be/KLG-jC1fh28">Git and Github<a/></li>
</ul>


## Dependencies

<ul>
  <li>
  	Backend - Springboot - pom.xml:
	<ul>
	  <li><a href="https://spring.io/projects/spring-ws">Spring Web (starter and dependencies)<a/> </li>
	  <li><a href="https://spring.io/projects/spring-data-jpa">JPA<a/></li> 
	  <li><a href="https://mvnrepository.com/search?q=H2">H2 Database<a/></li>
	  <li><a href="https://mvnrepository.com/artifact/org.springframework.security/spring-security-config">Security config<a/></li>
	</ul>
  </li>
  <li>
  	Frontend - React + Vite template - package.json:
	<ul>
	  <li><a href="https://www.npmjs.com/package/react-datepicker">datepicker<a/></li>
	  <li><a href="https://www.npmjs.com/search?q=axios">axios<a/></li> 
	  <li><a href="https://www.codecademy.com/learn/react-101/modules/react-hooks-u">hooks<a/></li>
	  <li><a href="https://www.npmjs.com/search?q=toastify">toastify<a/></li>
	</ul>
  </li>
</ul>




## Tools list

<ul>
	<li>Backend - Optional IDEs to Java 
		<ul>
			<li>Spring Tool Suite (STS)</li>
			<li>Eclipse</li>
			<li>intellij</li>
		</ul>	
	</li>
	<li>Frontend - Optional IDEs to React JS 
		<ul>
			<li>VS Studio Code</li>
			<li>Atom</li>
		</ul>	
	</li>
	<li>RESTful services
		<ul>
			<li>Postman</li>
			<li>Insomnia</li>
		</ul>
	</li>
	<li>Backend - Optional hosting
		<ul>
			<li>Heroku</li>
		</ul>	
	</li>
	<li>Frontend - Optional hosting
		<ul>
			<li>Netlify</li>
			<li>Vercel</li>
		</ul>	
	</li>
	</li>
</ul>

## Responsive

<div align="center"><a href="https://imgbox.com/klabFHPg" target="_blank"><img src="https://thumbs2.imgbox.com/73/be/klabFHPg_t.png" alt="image host"/></a></div>


## See the project

<ul>
  <li><a href="https://gilson-dsmeta.netlify.app" target="_blank">Netlify</a></li>
</ul>

## See the project with postgres

<ul>
  <li><a href="https://github.com/gil-son/dsmeta/tree/postgres">Postgres Version</a></li>
</ul>

## Source

<ul>
  <li><a href="https://devsuperior.com.br/" target="_blank">DevSuperior</a></li>
  <li><a href="https://github.com/devsuperior/sds-dsmeta" target="_blank">DevSuperior - Spring React week - sdsmeta</a></li>
</ul>
