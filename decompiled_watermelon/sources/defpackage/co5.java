package defpackage;

import android.net.Uri;
import android.widget.Toast;
import me.magnum.melonds.ui.romlist.a;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: co5  reason: default package */
/* loaded from: classes.dex */
public final class co5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ a c0;
    public final /* synthetic */ rg5 d0;
    public final /* synthetic */ Uri e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co5(a aVar, rg5 rg5Var, Uri uri, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.c0 = aVar;
        this.d0 = rg5Var;
        this.e0 = uri;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((co5) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((co5) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                co5 co5Var = new co5(this.c0, this.d0, this.e0, j11Var, 0);
                co5Var.Z = obj;
                return co5Var;
            default:
                co5 co5Var2 = new co5(this.c0, this.d0, this.e0, j11Var, 1);
                co5Var2.Z = obj;
                return co5Var2;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object kc5Var;
        int i;
        Object kc5Var2;
        int i2 = this.X;
        Object obj2 = o27.a;
        switch (i2) {
            case 0:
                o31 o31Var = (o31) this.Z;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                a aVar = this.c0;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            me2.a0(obj);
                        } else {
                            i.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        me2.a0(obj);
                        rg5 rg5Var = this.d0;
                        Uri uri = this.e0;
                        bb1 bb1Var = tg1.a;
                        ha1 ha1Var = ha1.L;
                        ug ugVar = new ug(aVar, rg5Var, uri, null, 10);
                        this.Z = null;
                        this.Y = 1;
                        if (tq5.G(ha1Var, ugVar, this) == p31Var) {
                            return p31Var;
                        }
                    }
                    kc5Var = obj2;
                } catch (Throwable th) {
                    kc5Var = new kc5(th);
                }
                if (!(kc5Var instanceof kc5)) {
                    i = R.string.rom_save_file_import_success;
                } else {
                    i = R.string.rom_save_file_import_failed;
                }
                Toast.makeText(aVar.requireContext(), i, 1).show();
                return obj2;
            default:
                o31 o31Var2 = (o31) this.Z;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                Uri uri2 = this.e0;
                a aVar2 = this.c0;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            me2.a0(obj);
                        } else {
                            i.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        me2.a0(obj);
                        bb1 bb1Var2 = tg1.a;
                        ha1 ha1Var2 = ha1.L;
                        n5 n5Var = new n5(aVar2, uri2, (j11) null, 29);
                        this.Z = null;
                        this.Y = 1;
                        obj = tq5.G(ha1Var2, n5Var, this);
                        if (obj == p31Var2) {
                            return p31Var2;
                        }
                    }
                    kc5Var2 = (Boolean) obj;
                    kc5Var2.getClass();
                } catch (Throwable th2) {
                    kc5Var2 = new kc5(th2);
                }
                Object obj3 = Boolean.FALSE;
                if (kc5Var2 instanceof kc5) {
                    kc5Var2 = obj3;
                }
                if (!((Boolean) kc5Var2).booleanValue()) {
                    Toast.makeText(aVar2.requireContext(), (int) R.string.rom_save_file_import_invalid, 1).show();
                    return obj2;
                }
                sb sbVar = new sb(aVar2.requireContext());
                sbVar.A(R.string.rom_save_file_import_title);
                rg5 rg5Var2 = this.d0;
                String str = rg5Var2.f.e;
                if (str == null) {
                    str = rg5Var2.a;
                }
                ((pb) sbVar.L).f = aVar2.getString(R.string.rom_save_file_import_message, str);
                sbVar.z(17039370, new cq1(aVar2, rg5Var2, uri2, 5));
                sbVar.x(17039360, null);
                sbVar.C();
                return obj2;
        }
    }
}
