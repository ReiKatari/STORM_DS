package defpackage;

import java.util.List;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d00  reason: default package */
/* loaded from: classes.dex */
public final class d00 extends dl4 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d00(Object obj, int i) {
        super(false);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.dl4
    public void a() {
        switch (this.d) {
            case 0:
                ((d2) this.e).l();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.dl4
    public final void b() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((d2) obj).m();
                return;
            case 1:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj;
                if (emulatorActivity.L1.getValue() != null) {
                    emulatorActivity.N();
                    return;
                } else {
                    emulatorActivity.W().M0(true);
                    return;
                }
            case 2:
                b bVar = ((LayoutEditorActivity) obj).F0;
                if (bVar != null) {
                    bVar.s();
                    return;
                } else {
                    nb3.a0("layoutEditorManager");
                    throw null;
                }
            case 3:
                ((rc4) obj).d();
                return;
            case 4:
                ((hg) obj).g(this);
                return;
            default:
                tp6 tp6Var = ((a) obj).j().G;
                List list = (List) tp6Var.getValue();
                if (list.size() > 1) {
                    tp6Var.m(null, gt0.E0(list));
                    return;
                }
                return;
        }
    }

    @Override // defpackage.dl4
    public void c(b00 b00Var) {
        switch (this.d) {
            case 0:
                ((d2) this.e).n(b00Var);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.dl4
    public void d(b00 b00Var) {
        switch (this.d) {
            case 0:
                ((d2) this.e).o();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d00(Object obj, boolean z, int i) {
        super(true);
        this.d = i;
        this.e = obj;
    }
}
