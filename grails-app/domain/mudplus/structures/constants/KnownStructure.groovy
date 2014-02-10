package mudplus.structures.constants

import mudplus.structures.instances.PersistentStructuralUnit

class KnownStructure {
    String name
    PersistentStructuralUnit base

    static hasMany = [extremities:PersistentStructuralUnit]

    static constraints = {
    }


}
