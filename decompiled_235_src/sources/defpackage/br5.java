package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: br5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class br5 implements qn2 {
    public final /* synthetic */ qa4 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ on2 R;
    public final /* synthetic */ List X;
    public final /* synthetic */ Map Y;
    public final /* synthetic */ qa4 Z;
    public final /* synthetic */ qa4 d0;
    public final /* synthetic */ qa4 e0;
    public final /* synthetic */ eo2 f0;

    public /* synthetic */ br5(qa4 qa4Var, int i, boolean z, on2 on2Var, List list, Map map, qa4 qa4Var2, qa4 qa4Var3, qa4 qa4Var4, eo2 eo2Var) {
        this.A = qa4Var;
        this.B = i;
        this.L = z;
        this.R = on2Var;
        this.X = list;
        this.Y = map;
        this.Z = qa4Var2;
        this.d0 = qa4Var3;
        this.e0 = qa4Var4;
        this.f0 = eo2Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        this.A.setValue(Boolean.TRUE);
        ak7.F(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, this.f0, Float.intBitsToFloat((int) (((jk4) obj).a & 4294967295L)));
        return jg7.a;
    }
}
