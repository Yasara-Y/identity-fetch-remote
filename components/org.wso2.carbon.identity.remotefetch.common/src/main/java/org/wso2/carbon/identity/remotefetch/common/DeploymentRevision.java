/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.remotefetch.common;

import java.io.File;
import java.util.Date;

/**
 * Holds details on Deployment Revisions.
 * Used to represent logical Revision data row at runtime.
 */
public class DeploymentRevision {

    private String fileRevisionId;
    private String configId;
    private File file;
    private String fileHash;
    private Date deployedDate;
    private DeploymentStatus deploymentStatus;
    private String itemName;

    /**
     * Status pf Deployment.
     */
    public enum DeploymentStatus {
        DEPLOYED, ERROR_DEPLOYING, FILE_MISSING
    }

    /**
     * Default constructor.
     * @param configId represents remoteFetchConfigurationId of the corresponding remote fetch configuration.
     * {@link RemoteFetchConfiguration}
     * @param file represents local repo file.
     */
    public DeploymentRevision(String configId, File file) {

        this.configId = configId;
        this.file = file;
    }

    /**
     * get file revision id.
     * Unique id for deployment revisions and generated by auto increment while adding into db.
     * @return fileRevisionId
     */
    public String getDeploymentRevisionId() {

        return fileRevisionId;
    }

    /**
     * set file revision id.
     * @param fileRevisionId fileRevisionId
     */
    public void setDeploymentRevisionId(String fileRevisionId) {

        this.fileRevisionId = fileRevisionId;
    }

    /**
     * get config Id.
     * @return configId
     */
    public String getConfigId() {

        return configId;
    }

    /**
     * set configId.
     * @param configId configId
     */
    public void setConfigId(String configId) {

        this.configId = configId;
    }

    /**
     * get File.
     * @return file
     */
    public File getFile() {

        return file;
    }

    /**
     * set file.
     * @param file file.
     */
    public void setFile(File file) {

        this.file = file;
    }

    /**
     * get FileHash which represents hash of the file used to check revision changed or not before deploying the file.
     * @return fileHash
     */
    public String getFileHash() {

        return fileHash;
    }

    /**
     * set fileHash.
     * @param fileHash fileHash
     */
    public void setFileHash(String fileHash) {

        this.fileHash = fileHash;
    }

    /**
     * get deployedDate which represent the time stamp of deployed time.
     * @return deployedDate
     */
    public Date getDeployedDate() {
        if (deployedDate == null) {
            return null;
        } else {
            return new Date(deployedDate.getTime());
        }
    }

    /**
     * set deployeddate.
     * @param deployedDate deployedDate
     */
    public void setDeployedDate(Date deployedDate) {
        if (deployedDate == null) {
            this.deployedDate = null;
        } else {
            this.deployedDate = new Date(deployedDate.getTime());
        }
    }

    /**
     * get deploymentStatus whether deployment failed or not.
     * @return deploymentStatus
     */
    public DeploymentStatus getDeploymentStatus() {

        return deploymentStatus;
    }

    /**
     * set deploymentStatus.
     * @param deploymentStatus deploymentStatus
     */
    public void setDeploymentStatus(DeploymentStatus deploymentStatus) {

        this.deploymentStatus = deploymentStatus;
    }

    /**
     * get ItemName which represents artifact name eg : ServiceProvider name.
     * @return itemName
     */
    public String getItemName() {

        return itemName;
    }

    /**
     * set itemName.
     * @param itemName itemName.
     */
    public void setItemName(String itemName) {

        this.itemName = itemName;
    }
}
