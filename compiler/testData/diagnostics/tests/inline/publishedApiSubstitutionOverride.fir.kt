@PublishedApi
internal interface History<T> {
    var isIgnoringPlatformChanges: Boolean
}

@PublishedApi
internal class VirtueNavControllerImpl<R>(
    @PublishedApi internal val history: History<R>
) {
    @PublishedApi
    internal <!NOTHING_TO_INLINE!>inline<!> fun syncWithHistory() {
        history.<!NON_PUBLIC_CALL_FROM_PUBLIC_INLINE!>isIgnoringPlatformChanges<!> = true
    }
}