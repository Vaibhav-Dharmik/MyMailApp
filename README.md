# Gmail Clone Deployment on Render with Jenkins

## Prerequisites
- Docker installed
- Jenkins installed
- Render account ([https://render.com](https://render.com))
- GitHub repository with the source code

## Steps

### Step 1: Create a Render Service
1. Go to [https://render.com](https://render.com).
2. Sign up and create a new **Web Service**.
3. Deploy any Docker image to get your **Service ID**.
4. Go to **Settings > API Keys** → Generate API Key.
5. Copy your **Service ID** and API Key.

### Step 2: Configure Jenkins Pipeline
1. Open Jenkins.
2. Create a new pipeline.
3. Use this Jenkinsfile.
4. Replace `YOUR_RENDER_SERVICE_ID` and `YOUR_RENDER_API_KEY` in the Jenkinsfile.
5. Trigger a build.

### Step 3: Build and Deploy
1. Jenkins will:
   - Build your Maven project.
   - Create a Docker image.
   - Push the image to **Docker Hub**.
   - Trigger deployment using Render API.

### Step 4: Verify Deployment
1. Go to your Render Dashboard.
2. Click on your project.
3. Open the application URL.
4. Your Gmail Clone should be live.

### Step 5: Automate Deployment (Optional)
1. Set up GitHub Webhooks to automatically trigger Jenkins on code push.
2. Configure Render to automatically deploy on Docker image update.

## Deployment Verification
1. Access your application via:
```
https://<your-render-app-url>
```
