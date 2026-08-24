package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x71  reason: default package */
/* loaded from: classes.dex */
public final class x71 extends android.database.ContentObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public x71(defpackage.du6 r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.b = r2
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r1.<init>(r2)
            return
    }

    public x71(defpackage.v80 r2, android.os.Handler r3) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.b = r2
            r1.<init>(r3)
            return
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.deliverSelfNotifications()
            return r1
        La:
            r1 = 1
            return r1
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.onChange(r2)
            return
        L9:
            java.lang.Object r1 = r1.b
            du6 r1 = (defpackage.du6) r1
            boolean r2 = r1.B
            if (r2 == 0) goto L23
            android.database.Cursor r2 = r1.L
            if (r2 == 0) goto L23
            boolean r2 = r2.isClosed()
            if (r2 != 0) goto L23
            android.database.Cursor r2 = r1.L
            boolean r2 = r2.requery()
            r1.A = r2
        L23:
            return
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean r2, android.net.Uri r3) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onChange(r2, r3)
            return
        L9:
            java.lang.Object r1 = r1.b
            v80 r1 = (defpackage.v80) r1
            jg7 r2 = defpackage.jg7.a
            r1.c(r2)
            return
    }
}
