package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jv2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jv2 implements z06 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f47 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jv2(f47 f47Var, Object obj, int i) {
        this.a = i;
        this.b = f47Var;
        this.c = obj;
    }

    @Override // defpackage.z06
    public final void a(d16 d16Var, a16 a16Var) {
        int i = this.a;
        Object obj = this.c;
        f47 f47Var = this.b;
        switch (i) {
            case 0:
                nv2 nv2Var = (nv2) f47Var;
                pv2 pv2Var = (pv2) obj;
                if (nv2Var.d() != null) {
                    nk2.s();
                    y06 y06Var = nv2Var.y;
                    if (y06Var != null) {
                        y06Var.b();
                        nv2Var.y = null;
                    }
                    kx2 kx2Var = nv2Var.x;
                    if (kx2Var != null) {
                        kx2Var.a();
                        nv2Var.x = null;
                    }
                    pv2Var.d();
                    nv2Var.f();
                    jx jxVar = nv2Var.i;
                    jxVar.getClass();
                    x06 G = nv2Var.G((rv2) nv2Var.h, jxVar);
                    nv2Var.w = G;
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = new Object[]{G.c()}[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    nv2Var.E(Collections.unmodifiableList(arrayList));
                    nv2Var.r();
                    return;
                }
                return;
            default:
                cy3 cy3Var = (cy3) f47Var;
                d16Var.getClass();
                a16Var.getClass();
                cy3Var.E(l07.b0(cy3Var.H((Size) obj).c()));
                cy3Var.r();
                return;
        }
    }
}
