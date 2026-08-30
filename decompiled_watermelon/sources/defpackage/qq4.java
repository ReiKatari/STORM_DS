package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qq4  reason: default package */
/* loaded from: classes.dex */
public final class qq4 extends pq4 {
    public final Object c;

    public qq4() {
        super(12);
        this.c = new Object();
    }

    @Override // defpackage.pq4
    public final Object a() {
        Object a;
        synchronized (this.c) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.pq4
    public final boolean c(Object obj) {
        boolean c;
        synchronized (this.c) {
            c = super.c(obj);
        }
        return c;
    }
}
