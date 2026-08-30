package xa;

import java.io.Writer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class z0 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        cb.b d02 = aVar.d0();
        if (d02 == cb.b.NULL) {
            aVar.Z();
            return null;
        } else if (d02 == cb.b.STRING) {
            return Boolean.valueOf(Boolean.parseBoolean(aVar.b0()));
        } else {
            return Boolean.valueOf(aVar.I());
        }
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        String str;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            cVar.F();
            return;
        }
        cVar.a0();
        cVar.d();
        Writer writer = cVar.A;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
    }
}
