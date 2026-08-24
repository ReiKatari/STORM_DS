package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rx7  reason: default package */
/* loaded from: classes.dex */
public final class rx7 {
    public final yw7 a;
    public final Context b;
    public final String c;
    public final ow7 d;
    public final az0 e;
    public final q61 f;
    public final o35 g;
    public final WorkDatabase h;
    public final dx7 i;
    public final zh1 j;
    public final ArrayList k;
    public final String l;
    public final tc3 m;

    public rx7(p87 p87Var) {
        yw7 yw7Var = (yw7) p87Var.f;
        this.a = yw7Var;
        this.b = (Context) p87Var.a;
        String str = yw7Var.a;
        this.c = str;
        this.d = (ow7) p87Var.c;
        az0 az0Var = (az0) p87Var.b;
        this.e = az0Var;
        this.f = az0Var.d;
        this.g = (o35) p87Var.d;
        WorkDatabase workDatabase = (WorkDatabase) p87Var.e;
        this.h = workDatabase;
        this.i = workDatabase.w();
        this.j = workDatabase.r();
        ArrayList arrayList = (ArrayList) p87Var.g;
        this.k = arrayList;
        this.l = i61.n(i61.t("Work [ id=", str, ", tags={ "), gt0.P0(arrayList, ",", null, null, null, 62), " } ]");
        this.m = yh2.c();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:37:0x009e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static final java.lang.Object a(defpackage.rx7 r23, defpackage.s41 r24) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx7.a(rx7, s41):java.lang.Object");
    }

    public final void b(int i) {
        iw7 iw7Var = iw7.ENQUEUED;
        dx7 dx7Var = this.i;
        String str = this.c;
        dx7Var.h(iw7Var, str);
        this.f.getClass();
        dx7Var.g(System.currentTimeMillis(), str);
        dx7Var.f(this.a.v, str);
        dx7Var.e(-1L, str);
        dx7Var.i(i, str);
    }

    public final void c() {
        this.f.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        dx7 dx7Var = this.i;
        String str = this.c;
        dx7Var.g(currentTimeMillis, str);
        dx7Var.h(iw7.ENQUEUED, str);
        m16 m16Var = dx7Var.a;
        ((Number) hv.Q(m16Var, false, true, new c70(str, 25))).intValue();
        dx7Var.f(this.a.v, str);
        hv.Q(m16Var, false, true, new c70(str, 26));
        dx7Var.e(-1L, str);
    }

    public final void d(mx3 mx3Var) {
        mx3Var.getClass();
        String str = this.c;
        ArrayList d0 = hf.d0(str);
        while (true) {
            boolean isEmpty = d0.isEmpty();
            dx7 dx7Var = this.i;
            if (!isEmpty) {
                String str2 = (String) gt0.Y0(d0);
                if (dx7Var.c(str2) != iw7.CANCELLED) {
                    dx7Var.h(iw7.FAILED, str2);
                }
                d0.addAll(this.j.a(str2));
            } else {
                xb1 xb1Var = ((jx3) mx3Var).a;
                xb1Var.getClass();
                dx7Var.f(this.a.v, str);
                hv.Q(dx7Var.a, false, true, new ja7(14, xb1Var, str));
                return;
            }
        }
    }
}
