package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: br0  reason: default package */
/* loaded from: classes.dex */
public final class br0 {
    public final String a;
    public List b = yt1.A;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public br0(String str) {
        this.a = str;
    }

    public static void a(br0 br0Var, String str, wb6 wb6Var) {
        br0Var.getClass();
        wb6Var.getClass();
        if (br0Var.d.add(str)) {
            br0Var.c.add(str);
            br0Var.e.add(wb6Var);
            br0Var.f.add(yt1.A);
            br0Var.g.add(false);
            return;
        }
        StringBuilder t = i61.t("Element with name '", str, "' is already registered in ");
        t.append(br0Var.a);
        throw new IllegalArgumentException(t.toString().toString());
    }
}
