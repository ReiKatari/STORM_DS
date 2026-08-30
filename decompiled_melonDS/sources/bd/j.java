package bd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final p f2169a = new p(-1, null, null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f2170b = ed.b.l(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c  reason: collision with root package name */
    public static final int f2171c = ed.b.l(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d  reason: collision with root package name */
    public static final a0.c f2172d = new a0.c("BUFFERED", 1);

    /* renamed from: e  reason: collision with root package name */
    public static final a0.c f2173e = new a0.c("SHOULD_BUFFER", 1);

    /* renamed from: f  reason: collision with root package name */
    public static final a0.c f2174f = new a0.c("S_RESUMING_BY_RCV", 1);

    /* renamed from: g  reason: collision with root package name */
    public static final a0.c f2175g = new a0.c("RESUMING_BY_EB", 1);

    /* renamed from: h  reason: collision with root package name */
    public static final a0.c f2176h = new a0.c("POISONED", 1);

    /* renamed from: i  reason: collision with root package name */
    public static final a0.c f2177i = new a0.c("DONE_RCV", 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a0.c f2178j = new a0.c("INTERRUPTED_SEND", 1);

    /* renamed from: k  reason: collision with root package name */
    public static final a0.c f2179k = new a0.c("INTERRUPTED_RCV", 1);

    /* renamed from: l  reason: collision with root package name */
    public static final a0.c f2180l = new a0.c("CHANNEL_CLOSED", 1);
    public static final a0.c m = new a0.c("SUSPEND", 1);

    /* renamed from: n  reason: collision with root package name */
    public static final a0.c f2181n = new a0.c("SUSPEND_NO_WAITER", 1);

    /* renamed from: o  reason: collision with root package name */
    public static final a0.c f2182o = new a0.c("FAILED", 1);

    /* renamed from: p  reason: collision with root package name */
    public static final a0.c f2183p = new a0.c("NO_RECEIVE_RESULT", 1);

    /* renamed from: q  reason: collision with root package name */
    public static final a0.c f2184q = new a0.c("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: r  reason: collision with root package name */
    public static final a0.c f2185r = new a0.c("CLOSE_HANDLER_INVOKED", 1);

    /* renamed from: s  reason: collision with root package name */
    public static final a0.c f2186s = new a0.c("NO_CLOSE_CAUSE", 1);

    public static final boolean a(zc.g gVar, Object obj, mc.q qVar) {
        a0.c o5 = gVar.o(obj, qVar);
        if (o5 != null) {
            gVar.s(o5);
            return true;
        }
        return false;
    }
}
