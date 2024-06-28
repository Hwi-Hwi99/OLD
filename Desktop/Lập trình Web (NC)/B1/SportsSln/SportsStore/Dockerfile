# Use the official .NET SDK image.
# https://hub.docker.com/_/microsoft-dotnet-sdk/
FROM mcr.microsoft.com/dotnet/sdk:6.0 AS build
WORKDIR /app

# Copy csproj and restore as distinct layers
COPY *.csproj ./
RUN dotnet restore

# Copy everything else and build the app
COPY . ./
RUN dotnet publish -c Release -o out

# Build runtime image
FROM mcr.microsoft.com/dotnet/aspnet:6.0 AS runtime
WORKDIR /app
COPY --from=build /app/out ./

# Configure ASP.NET Core Environment
ENV ASPNETCORE_ENVIRONMENT Production

# Expose port
EXPOSE 5002

# Start the application
ENTRYPOINT ["dotnet", "SportsStore.dll"]
