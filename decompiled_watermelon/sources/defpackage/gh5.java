package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gh5  reason: default package */
/* loaded from: classes.dex */
public final class gh5 implements PointerInputEventHandler {
    public final /* synthetic */ k24 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ki2 d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Map f;
    public final /* synthetic */ k24 g;
    public final /* synthetic */ k24 h;
    public final /* synthetic */ k24 i;
    public final /* synthetic */ aj2 j;

    public gh5(k24 k24Var, int i, boolean z, ki2 ki2Var, List list, Map map, k24 k24Var2, k24 k24Var3, k24 k24Var4, aj2 aj2Var) {
        this.a = k24Var;
        this.b = i;
        this.c = z;
        this.d = ki2Var;
        this.e = list;
        this.f = map;
        this.g = k24Var2;
        this.h = k24Var3;
        this.i = k24Var4;
        this.j = aj2Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(vp4 vp4Var, j11 j11Var) {
        k24 k24Var = this.a;
        int i = this.b;
        boolean z = this.c;
        ki2 ki2Var = this.d;
        List list = this.e;
        Map map = this.f;
        k24 k24Var2 = this.g;
        k24 k24Var3 = this.h;
        k24 k24Var4 = this.i;
        aj2 aj2Var = this.j;
        dh5 dh5Var = new dh5(k24Var, i, z, ki2Var, list, map, k24Var2, k24Var3, k24Var4, aj2Var);
        eh5 eh5Var = new eh5(k24Var, k24Var4, k24Var3, 0);
        eh5 eh5Var2 = new eh5(k24Var, k24Var4, k24Var3, 1);
        fh5 fh5Var = new fh5(i, z, ki2Var, list, map, k24Var2, k24Var3, k24Var4, aj2Var);
        float f = mj1.a;
        Object m = ve2.m(vp4Var, new ij1(dh5Var, fh5Var, eh5Var, eh5Var2, (j11) null, 1), j11Var);
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        o27 o27Var = o27.a;
        if (m != p31Var) {
            m = o27Var;
        }
        if (m == p31Var) {
            return m;
        }
        return o27Var;
    }
}
