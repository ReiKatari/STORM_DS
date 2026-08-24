package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cm5  reason: default package */
/* loaded from: classes.dex */
public abstract class cm5 extends defpackage.d20 {
    public cm5(defpackage.r41 r1) {
            r0 = this;
            r0.<init>(r1)
            if (r1 == 0) goto L15
            l61 r0 = r1.b()
            vt1 r1 = defpackage.vt1.A
            if (r0 != r1) goto Le
            goto L15
        Le:
            java.lang.String r0 = "Coroutines with restricted suspension must have EmptyCoroutineContext"
            defpackage.i.h(r0)
            r0 = 0
            throw r0
        L15:
            return
    }

    @Override // defpackage.r41
    public final defpackage.l61 b() {
            r0 = this;
            vt1 r0 = defpackage.vt1.A
            return r0
    }
}
