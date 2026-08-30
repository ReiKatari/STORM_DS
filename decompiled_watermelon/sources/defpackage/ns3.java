package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ns3  reason: default package */
/* loaded from: classes.dex */
public interface ns3 {
    rd3 a(rd3 rd3Var);

    default long c(rd3 rd3Var, rd3 rd3Var2) {
        rd3 a = a(rd3Var);
        rd3 a2 = a(rd3Var2);
        if (a instanceof is3) {
            return ((is3) a).R(a2, 0L, true);
        }
        if (a2 instanceof is3) {
            return ((is3) a2).R(a, 0L, true) ^ (-9223372034707292160L);
        }
        return a.R(a, 0L, true);
    }
}
