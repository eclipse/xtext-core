// tell Jenkins how to build projects from this repository
node {
	try {
		
		stage 'Checkout'
		checkout scm
			
		stage 'Build'
		sh "./gradlew build createLocalMavenRepo"
		archive 'build/maven-repository/**/*.*'

		step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/*.xml'])
		
		slackSend "Build Succeeded - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
		
	} catch (e) {
		slackSend color: 'danger', message: "Build Failed - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
		throw e
	}
}