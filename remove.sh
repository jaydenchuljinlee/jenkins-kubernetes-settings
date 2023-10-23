kubectl delete statefulset prometheus-alertmanager
helm uninstall prometheus prometheus-community/kube-prometheus-stack

kubectl delete statefulset jenkins
kubectl delete service jenkins
kubectl delete service jenkins-agent
helm uninstall jenkins jenkins/jenkins
