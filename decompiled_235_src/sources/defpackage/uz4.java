package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uz4  reason: default package */
/* loaded from: classes.dex */
public final class uz4 extends tz4 {
    public final Object c;

    public uz4() {
        super(12);
        this.c = new Object();
    }

    @Override // defpackage.tz4
    public final Object a() {
        Object a;
        synchronized (this.c) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.tz4
    public final boolean c(Object obj) {
        boolean c;
        synchronized (this.c) {
            c = super.c(obj);
        }
        return c;
    }
}
