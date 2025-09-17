import 'package:flutter/material.dart';

void main() => runApp(const PiManagerApp());

class PiManagerApp extends StatelessWidget {
  const PiManagerApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Pi Manager',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.teal),
        useMaterial3: true,
      ),
      home: const HomeScreen(),
      debugShowCheckedModeBanner: false,
    );
  }
}

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Pi Manager')),
      body: const Center(
        child: Text(
          'Hello from Pi Manager!',
          style: TextStyle(fontSize: 24),
        ),
      ),
    );
  }
}
