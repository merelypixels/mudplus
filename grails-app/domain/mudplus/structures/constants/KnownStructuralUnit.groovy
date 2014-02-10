package mudplus.structures.constants

import mudplus.measure.constants.KnownMeasure
import mudplus.statistics.instances.PersistentStatistic

class KnownStructuralUnit {
    KnownMeasure volume
    KnownMeasure weight
    KnownMeasure height
    KnownMeasure width
    KnownMeasure depth

    static hasMany = [ sraristicValues: PersistentStatistic ]

    static constraints = {
    }
}
