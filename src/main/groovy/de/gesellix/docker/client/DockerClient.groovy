package de.gesellix.docker.client

interface DockerClient {

  def dockerHost(hostname, port)

  def auth(authDetails)

  def build(InputStream buildContext)

  def tag(imageId, repositoryName)

  def push(repositoryName, authBase64Encoded)

  def pull(imageName)

  def pull(imageName, tag)

  def ps()

  def images()

  def createContainer(containerConfig)

  def startContainer(containerId)

  def run(fromImage, containerConfig)

  def stop(containerId)

  def rm(containerId)

  def rmi()
}
