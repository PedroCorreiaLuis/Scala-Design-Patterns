package CreationalPatterns.AbstractFactory

sealed trait CPU
class EmberCPU extends CPU
class EnginolaCPU extends CPU

sealed trait MMU
class EmberMMU extends MMU
class EnginolaMMU extends MMU
