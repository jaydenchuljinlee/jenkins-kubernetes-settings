# :house: 로컬 환경에서 Jenkins & Kubernets를 통해 Gradle 프로젝트 배포해보자

# :pushpin: Gradle Project
- Jdk 11 사용
- Gradle 7.0 사용
- ./gradlew build로 프로젝트 빌드

# :pushpin: Jenkins Helm Chat Values
- [Jenkins Heml Chart](https://github.com/jenkinsci/helm-charts/blob/main/charts/jenkins/values.yaml)
- Jenkins Controller 권한을 위해 runAsUser / fsGroup 권한을 0으로 Root 권한을 주게함

# :pushpin: Prometheus Helm Chat Values
- [Prometheus Starter Helm Chart](https://github.com/prometheus-community/helm-charts/blob/main/charts/kube-prometheus-stack/values.yaml)
- Docker Desctop에서 Issue 발생으로 인해 다음과 같이 수정 => prometheus-values.yaml
- node exporter 아래 hostrootFsMount 관련 false 처리
![image](https://github.com/jaydenchuljinlee/jenkins-kubernetes-settings/assets/34643599/7992f4f8-9e36-4d80-be6e-bfa0289eac97)

