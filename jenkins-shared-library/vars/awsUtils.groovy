def uploadToS3(String bucket, String filePath) {
    echo 'Configuring AWS and uploading artifact...'
    sh "aws configure set region ap-south-1"
    sh "aws s3 cp ${filePath} s3://${bucket}"
}

def archiveArtifacts(String filePattern) {
    echo 'Archiving artifacts...'
    archiveArtifacts artifacts: filePattern, fingerprint: true
}
