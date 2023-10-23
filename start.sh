helm install prometheus prometheus-community/kube-prometheus-stack -f prometheus-stack-values.yaml
helm install jenkins jenkins/jenkins -f jenkins-values.yaml
