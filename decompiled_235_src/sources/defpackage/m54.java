package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m54  reason: default package */
/* loaded from: classes.dex */
public final class m54 {
    public final ap3 a;
    public final bt b;
    public final HashMap c;

    public m54(Context context, bt btVar) {
        ap3 ap3Var = new ap3(context);
        this.c = new HashMap();
        this.a = ap3Var;
        this.b = btVar;
    }

    public final synchronized pb7 a(String str) {
        if (this.c.containsKey(str)) {
            return (pb7) this.c.get(str);
        }
        CctBackendFactory s = this.a.s(str);
        if (s == null) {
            return null;
        }
        bt btVar = this.b;
        pb7 create = s.create(new yx((Context) btVar.R, (wr0) btVar.B, (wr0) btVar.L, str));
        this.c.put(str, create);
        return create;
    }
}
