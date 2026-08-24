package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx1  reason: default package */
/* loaded from: classes.dex */
public final class qx1 extends defpackage.lb4 {
    public final me.magnum.melonds.domain.model.ConsoleType o;

    public qx1(me.magnum.melonds.domain.model.ConsoleType r1) {
            r0 = this;
            r0.<init>()
            r0.o = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L12
        L3:
            boolean r0 = r2 instanceof defpackage.qx1
            if (r0 != 0) goto L8
            goto L10
        L8:
            qx1 r2 = (defpackage.qx1) r2
            me.magnum.melonds.domain.model.ConsoleType r1 = r1.o
            me.magnum.melonds.domain.model.ConsoleType r2 = r2.o
            if (r1 == r2) goto L12
        L10:
            r1 = 0
            return r1
        L12:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            me.magnum.melonds.domain.model.ConsoleType r0 = r0.o
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FirmwareSession(consoleType="
            r0.<init>(r1)
            me.magnum.melonds.domain.model.ConsoleType r2 = r2.o
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
