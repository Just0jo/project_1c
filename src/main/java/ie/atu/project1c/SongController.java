package ie.atu.project1c;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {
    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {

        this.songService = songService;
    }

    @PostMapping("/songs")
    public String User(@RequestBody SongUser songUser) {
        return songService.ackMessage(songUser);
    }
}

