package defpackage;

import android.net.Uri;
import android.widget.Toast;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sy5  reason: default package */
/* loaded from: classes.dex */
public final class sy5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ a d0;
    public final /* synthetic */ pq5 e0;
    public final /* synthetic */ Uri f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sy5(a aVar, pq5 pq5Var, Uri uri, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = aVar;
        this.e0 = pq5Var;
        this.f0 = uri;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((sy5) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((sy5) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                sy5 sy5Var = new sy5(this.d0, this.e0, this.f0, r41Var, 0);
                sy5Var.Z = obj;
                return sy5Var;
            default:
                sy5 sy5Var2 = new sy5(this.d0, this.e0, this.f0, r41Var, 1);
                sy5Var2.Z = obj;
                return sy5Var2;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object em5Var;
        int i;
        Object em5Var2;
        int i2 = this.X;
        Object obj2 = jg7.a;
        switch (i2) {
            case 0:
                w61 w61Var = (w61) this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                a aVar = this.d0;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        pq5 pq5Var = this.e0;
                        Uri uri = this.f0;
                        xe1 xe1Var = xk1.a;
                        de1 de1Var = de1.L;
                        ag agVar = new ag(aVar, pq5Var, uri, null, 14);
                        this.Z = null;
                        this.Y = 1;
                        if (hv.d0(de1Var, agVar, this) == x61Var) {
                            return x61Var;
                        }
                    }
                    em5Var = obj2;
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                if (!(em5Var instanceof em5)) {
                    i = R.string.rom_save_file_import_success;
                } else {
                    i = R.string.rom_save_file_import_failed;
                }
                Toast.makeText(aVar.requireContext(), i, 1).show();
                return obj2;
            default:
                w61 w61Var2 = (w61) this.Z;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                Uri uri2 = this.f0;
                a aVar2 = this.d0;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        xe1 xe1Var2 = xk1.a;
                        de1 de1Var2 = de1.L;
                        xy5 xy5Var = new xy5(aVar2, uri2, (r41) null, 0);
                        this.Z = null;
                        this.Y = 1;
                        obj = hv.d0(de1Var2, xy5Var, this);
                        if (obj == x61Var2) {
                            return x61Var2;
                        }
                    }
                    em5Var2 = (Boolean) obj;
                    em5Var2.getClass();
                } catch (Throwable th2) {
                    em5Var2 = new em5(th2);
                }
                Object obj3 = Boolean.FALSE;
                if (em5Var2 instanceof em5) {
                    em5Var2 = obj3;
                }
                if (!((Boolean) em5Var2).booleanValue()) {
                    Toast.makeText(aVar2.requireContext(), (int) R.string.rom_save_file_import_invalid, 1).show();
                    return obj2;
                }
                zb zbVar = new zb(aVar2.requireContext());
                zbVar.z(R.string.rom_save_file_import_title);
                pq5 pq5Var2 = this.e0;
                String str = pq5Var2.f.e;
                if (str == null) {
                    str = pq5Var2.a;
                }
                ((wb) zbVar.L).f = aVar2.getString(R.string.rom_save_file_import_message, str);
                zbVar.y(17039370, new qu1(aVar2, pq5Var2, uri2, 5));
                zbVar.x(17039360, null);
                zbVar.B();
                return obj2;
        }
    }
}
