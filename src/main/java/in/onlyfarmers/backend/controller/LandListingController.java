package in.onlyfarmers.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/land-listings")
public class LandListingController {

    @GetMapping
    public ResponseEntity<?> getAllLandListings() {
        // TODO: Fetch land listings from Firebase Firestore/Realtime Database
        return ResponseEntity.ok(List.of()); // Placeholder: return empty list
    }

    @PostMapping
    public ResponseEntity<?> createLandListing(@RequestBody Map<String, Object> payload) {
        // TODO: Store land listing in Firebase Firestore/Realtime Database
        return ResponseEntity.ok(Map.of("message", "Land listing created (Firebase logic placeholder)"));
    }
} 