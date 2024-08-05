@RestController
@RequestMapping("/api/maintenance")
public class MaintenanceController {

    @Autowired
    private MaintenanceService maintenanceService;

    @GetMapping("/logs")
    public ResponseEntity<List<SystemLog>> getSystemLogs() {
        List<SystemLog> logs = maintenanceService.getSystemLogs();
        return ResponseEntity.ok(logs);
    }

    @PostMapping("/config")
    public ResponseEntity<String> updateSystemConfig(@RequestBody SystemConfig config) {
        maintenanceService.updateSystemConfig(config);
        return ResponseEntity.ok("System configuration updated successfully");
    }
}
