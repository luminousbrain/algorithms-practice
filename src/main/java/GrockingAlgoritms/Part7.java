package GrockingAlgoritms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Part7 {
    private static Set<String> processed = new HashSet<>();

    public static void main(String[] args) {
//        Map<String, Map<String, Double>> graph = new HashMap<>();
//        Map<String, Double> mapStart = new HashMap<>();
//        mapStart.put("A", 6.0);
//        mapStart.put("B", 2.0);
//        graph.put("start", mapStart);
//
//        Map<String, Double> mapA = new HashMap<>();
//        mapA.put("end", 1.0);
//        graph.put("A", mapA);
//
//        Map<String, Double> mapB = new HashMap<>();
//        mapB.put("A", 3.0);
//        mapB.put("end", 5.0);
//        graph.put("B", mapB);
//
//        Map<String, Double> mapEnd = new HashMap<>();
//        graph.put("end", mapEnd);
//
//        Map<String, Double> costs = new HashMap<>();
//        costs.put("A", 6.0);
//        costs.put("B", 2.0);
//        costs.put("end", Double.POSITIVE_INFINITY);
//
//        Map<String, String> parents = new HashMap<>();
//        parents.put("A", "start");
//        parents.put("B", "start");
//        parents.put("end", null);

        // Test
        Map<String, Map<String, Double>> graph = new HashMap<>();
        graph.put("s", new HashMap<>() {{put("1", 5.0); put("2", 2.0);}});
        graph.put("1", new HashMap<>() {{put("3", 4.0); put("4", 2.0);}});
        graph.put("2", new HashMap<>() {{put("1", 8.0); put("4", 7.0);}});
        graph.put("3", new HashMap<>() {{put("4", 6.0); put("e", 3.0);}});
        graph.put("4", new HashMap<>() {{put("e", 1.0);}});

        Map<String, Double> costs = new HashMap<>();
        costs.put("1", 5.0);
        costs.put("2", 2.0);
        costs.put("3", Double.POSITIVE_INFINITY);
        costs.put("4", Double.POSITIVE_INFINITY);
        costs.put("e", Double.POSITIVE_INFINITY);

        Map<String, String> parents = new HashMap<>();
        parents.put("1", "s");
        parents.put("2", "s");
        parents.put("3", "1");
        parents.put("4", "2");
        parents.put("e", null);

        // Алгоритм Дейкстры
        algorithmDijkstra(graph, parents, costs);
    }

    private static void algorithmDijkstra(Map<String, Map<String, Double>> graph, Map<String, String> parents, Map<String, Double> costs) {
        String node = findLowestCostNode(costs);
        while (node != null) {
            Double cost = costs.get(node);
            Map<String, Double> neighbors = graph.get(node);
            for (Map.Entry<String, Double> neighbor : neighbors.entrySet()) {
                Double newCost = cost + neighbor.getValue();

                if (costs.get(neighbor.getKey()) > newCost) {
                    costs.put(neighbor.getKey(), newCost);
                    parents.put(neighbor.getKey(), node);
                }
            }
            processed.add(node);
            node = findLowestCostNode(costs);
        }
        System.out.println(parents);
        System.out.println(costs);
    }

    private static String findLowestCostNode(Map<String, Double> costs) {
        Double low = Double.POSITIVE_INFINITY;
        String lowestCostNode = null;
        for (Map.Entry<String, Double> entry : costs.entrySet()) {
            if (entry.getValue() < low && !processed.contains(entry.getKey())) {
                low = entry.getValue();
                lowestCostNode = entry.getKey();
            }
        }
        return lowestCostNode;
    }
}