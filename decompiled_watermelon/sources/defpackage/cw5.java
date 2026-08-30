package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cw5  reason: default package */
/* loaded from: classes.dex */
public final class cw5 implements xg4 {
    public final int A;
    public final List B;
    public Float L = null;
    public Float R = null;
    public rv5 X = null;
    public rv5 Y = null;

    public cw5(int i, ArrayList arrayList) {
        this.A = i;
        this.B = arrayList;
    }

    @Override // defpackage.xg4
    public final boolean D() {
        return this.B.contains(this);
    }
}
