package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lt7  reason: default package */
/* loaded from: classes.dex */
public final class lt7 extends defpackage.uj2 {
    public final /* synthetic */ int h;
    public final /* synthetic */ defpackage.nt7 i;

    public /* synthetic */ lt7(defpackage.nt7 r1, int r2) {
            r0 = this;
            r0.h = r2
            r0.i = r1
            r0.<init>()
            return
    }

    @Override // defpackage.kp7
    public final void c() {
            r3 = this;
            int r0 = r3.h
            r1 = 0
            nt7 r3 = r3.i
            switch(r0) {
                case 0: goto L10;
                default: goto L8;
            }
        L8:
            r3.E = r1
            androidx.appcompat.widget.ActionBarContainer r3 = r3.o
            r3.requestLayout()
            return
        L10:
            boolean r0 = r3.z
            if (r0 == 0) goto L21
            android.view.View r0 = r3.r
            if (r0 == 0) goto L21
            r2 = 0
            r0.setTranslationY(r2)
            androidx.appcompat.widget.ActionBarContainer r0 = r3.o
            r0.setTranslationY(r2)
        L21:
            androidx.appcompat.widget.ActionBarContainer r0 = r3.o
            r2 = 8
            r0.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContainer r0 = r3.o
            r2 = 0
            r0.setTransitioning(r2)
            r3.E = r1
            u63 r0 = r3.v
            if (r0 == 0) goto L3d
            mt7 r2 = r3.u
            r0.x(r2)
            r3.u = r1
            r3.v = r1
        L3d:
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = r3.n
            if (r3 == 0) goto L46
            java.util.WeakHashMap r0 = defpackage.ao7.a
            r3.requestApplyInsets()
        L46:
            return
    }
}
