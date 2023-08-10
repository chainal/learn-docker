FROM node:18.17.0-alpine3.18
WORKDIR /root
COPY package.json ./
RUN npm install
COPY src ./src
COPY public ./public
RUN npm run build

FROM nginx:1.25.1
COPY --from=0 /root/build /usr/share/nginx/html
