package bi;

import android.content.SharedPreferences;
import android.net.Uri;
import java.util.List;
import kf.d2;
import n2.w0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements h.b {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ c(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // h.b
    public final void a(Object obj) {
        int i2 = this.A;
        Object obj2 = this.B;
        switch (i2) {
            case 0:
                e eVar = (e) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    i0 i0Var = (i0) eVar.Z.getValue();
                    sd.d dVar = i0Var.f2289f;
                    sd.f fVar = sd.f.READ_WRITE;
                    if (dVar.a(uri, fVar) == sd.c.OK) {
                        sd.i iVar = i0Var.f2288e;
                        iVar.getClass();
                        iVar.f12874a.getContentResolver().takePersistableUriPermission(uri, fVar.toFlags());
                        d2 d2Var = (d2) i0Var.f2286c;
                        d2Var.getClass();
                        SharedPreferences.Editor edit = d2Var.f8181b.edit();
                        edit.putStringSet("rom_search_dirs", p7.j.E(uri.toString()));
                        edit.apply();
                        return;
                    }
                    i0Var.f2295l.p(yb.y.f14813a);
                    return;
                }
                List list = e.f2279b0;
                return;
            default:
                ((mc.l) ((w0) obj2).getValue()).k(obj);
                return;
        }
    }
}
