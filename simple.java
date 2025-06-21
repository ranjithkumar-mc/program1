pipeline {
agent any
stages {
stage(&#39;Checkout&#39;) {
steps {
git url: &#39;https://github.com/Nandhini0307/program3.git&#39;, branch: &#39;main&#39;
}
}
stage(&#39;Build&#39;) {
steps {

echo &#39;Building...&#39;

}
}
stage(&#39;Test&#39;) {
steps {

echo &#39;Testing...&#39;
}
}
stage(&#39;Deploy&#39;) {
steps {

echo &#39;Deploying...&#39;

}
}
post {
success {
echo &#39;Pipeline completed successfully!&#39;
}
failure {
echo &#39;Pipeline failed!&#39;
}
}}
