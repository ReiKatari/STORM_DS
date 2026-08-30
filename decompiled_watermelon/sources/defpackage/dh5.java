package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dh5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dh5 implements mi2 {
    public final /* synthetic */ k24 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ ki2 R;
    public final /* synthetic */ List X;
    public final /* synthetic */ Map Y;
    public final /* synthetic */ k24 Z;
    public final /* synthetic */ k24 c0;
    public final /* synthetic */ k24 d0;
    public final /* synthetic */ aj2 e0;

    public /* synthetic */ dh5(k24 k24Var, int i, boolean z, ki2 ki2Var, List list, Map map, k24 k24Var2, k24 k24Var3, k24 k24Var4, aj2 aj2Var) {
        this.A = k24Var;
        this.B = i;
        this.L = z;
        this.R = ki2Var;
        this.X = list;
        this.Y = map;
        this.Z = k24Var2;
        this.c0 = k24Var3;
        this.d0 = k24Var4;
        this.e0 = aj2Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        this.A.setValue(Boolean.TRUE);
        nk2.l(this.B, this.L, this.R, this.X, this.Y, this.Z, this.c0, this.d0, this.e0, Float.intBitsToFloat((int) (((mb4) obj).a & 4294967295L)));
        return o27.a;
    }
}
