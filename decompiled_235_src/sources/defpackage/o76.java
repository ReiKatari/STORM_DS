package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o76  reason: default package */
/* loaded from: classes.dex */
public final class o76 implements aq4 {
    public final int A;
    public final List B;
    public Float L = null;
    public Float R = null;
    public e76 X = null;
    public e76 Y = null;

    public o76(int i, ArrayList arrayList) {
        this.A = i;
        this.B = arrayList;
    }

    @Override // defpackage.aq4
    public final boolean r() {
        return this.B.contains(this);
    }
}
