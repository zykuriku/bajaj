# WPick API Documentation

Welcome to the WPick API documentation! This API allows users to access information about international and Indian web series.

## Base URL

The base URL for accessing the WPick API is: https://wpick-kvp.up.railway.app/

## Endpoints

### 1. Welcome Page

- **Endpoint:** `GET /`
- **Description:** Retrieves a welcome message introducing users to the WPick API.
- **Example Request:**
  ```bash
  curl -X GET https://wpick-kvp.up.railway.app/
- **Example Response:**
     ```
     Welcome to Wpick API wherein you can have fun with loads of international and Indian Web Series!
     ```

### 2. Get All Web Series
   - **Endpoint:** `GET /series`
   - **Description:** Retrieves a list of all web series available in the database.
   - **Example Request:**
     ```bash
     curl -X GET https://wpick-kvp.up.railway.app/series
     ```
   - **Example Response:**
     ```json
     [
       {
         "id": 1,
         "name": "Web Series 1",
         "description": "Description of Web Series 1",
         "rating": 8.5,
         "platformsFree": ["Netflix", "Amazon Prime"],
         "allPlatforms": ["Netflix", "Amazon Prime", "Disney+"],
         "genre": "Drama",
         "year": 2020,
         "seasons": 2,
         "episodesPerSeason": [8, 10],
         "languages": ["English", "Spanish"],
         "cast": ["Actor A", "Actress B"]
       },
       {
         "id": 2,
         "name": "Web Series 2",
         "description": "Description of Web Series 2",
         "rating": 9.0,
         "platformsFree": ["Netflix"],
         "allPlatforms": ["Netflix", "Hulu"],
         "genre": "Thriller",
         "year": 2019,
         "seasons": 3,
         "episodesPerSeason": [10, 12, 10],
         "languages": ["English", "French"],
         "cast": ["Actor C", "Actress D"]
       }
     ]
     ```

  ### 3. Get Web Series by Name
   - **Endpoint:** `GET /series/{name}`
   - **Description:** Retrieves details of a web series by its name.
   - **Example Request:**
     ```bash
     curl -X GET https://wpick-kvp.up.railway.app/series/Web%20Series%201
     ```
   - **Example Response:**
     ```json
     {
       "id": 1,
       "name": "Web Series 1",
       "description": "Description of Web Series 1",
       "rating": 8.5,
       "platformsFree": ["Netflix", "Amazon Prime"],
       "allPlatforms": ["Netflix", "Amazon Prime", "Disney+"],
       "genre": "Drama",
       "year": 2020,
       "seasons": 2,
       "episodesPerSeason": [8, 10],
       "languages": ["English", "Spanish"],
       "cast": ["Actor A", "Actress B"]
     }
     ```

### 4. Save a New Web Series
   - **Endpoint:** `POST /save`
   - **Description:** Saves a new web series to the database.
   - **Example Request:**
     ```bash
     curl -X POST -H "Content-Type: application/json" -d '{
       "name": "New Web Series",
       "description": "Description of New Web Series",
       "rating": 8.0,
       "platformsFree": ["Netflix"],
       "allPlatforms": ["Netflix", "Hulu"],
       "genre": "Comedy",
       "year": 2021,
       "seasons": 1,
       "episodesPerSeason": [10],
       "languages": ["English"],
       "cast": ["Actor X", "Actress Y"]
     }' https://wpick-kvp.up.railway.app/api/save
     ```
   - **Example Response:**
     ```plaintext
     saved..
     ```

### 5. Update an Existing Web Series
   - **Endpoint:** `PUT /update/{id}`
   - **Description:** Updates an existing web series by its ID.
   - **Example Request:**
     ```bash
     curl -X PUT -H "Content-Type: application/json" -d '{
       "name": "Updated Web Series",
       "description": "Updated Description",
       "rating": 9.0,
       "platformsFree": ["Netflix", "Amazon Prime"],
       "allPlatforms": ["Netflix", "Amazon Prime"],
       "genre": "Action",
       "year": 2019,
       "seasons": 2,
       "episodesPerSeason": [12, 10],
       "languages": ["English", "Spanish"],
       "cast": ["Actor A", "Actor B"]
     }' https://wpick-kvp.up.railway.app/update/1
     ```
   - **Example Response:**
     ```plaintext
     updated..
     ```

### 6. Delete a Web Series
   - **Endpoint:** `DELETE /delete/{id}`
   - **Description:** Deletes a web series by its ID.
   - **Example Request:**
     ```bash
     curl -X DELETE https://wpick-kvp.up.railway.app/delete/1
     ```
   - **Example Response:**
     ```plaintext
     Delete series with id: 1
     ```

