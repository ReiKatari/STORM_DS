package defpackage;

import java.util.List;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: my  reason: default package */
/* loaded from: classes.dex */
public final class my extends fc4 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my(int i, Object obj) {
        super(false);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.fc4
    public void a() {
        switch (this.d) {
            case 0:
                ((b2) this.e).l();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.fc4
    public final void b() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((b2) obj).m();
                return;
            case 1:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj;
                if (emulatorActivity.F1.getValue() != null) {
                    emulatorActivity.N();
                    return;
                } else {
                    emulatorActivity.U().O0(true);
                    return;
                }
            case 2:
                b bVar = ((LayoutEditorActivity) obj).E0;
                if (bVar != null) {
                    bVar.s();
                    return;
                } else {
                    b53.g0("layoutEditorManager");
                    throw null;
                }
            case 3:
                ((l44) obj).d();
                return;
            case 4:
                ((sf) obj).n(this);
                return;
            default:
                ee6 ee6Var = ((a) obj).j().D;
                List list = (List) ee6Var.getValue();
                if (list.size() > 1) {
                    ee6Var.l(null, tq0.H0(list));
                    return;
                }
                return;
        }
    }

    @Override // defpackage.fc4
    public void c(ky kyVar) {
        switch (this.d) {
            case 0:
                ((b2) this.e).n(kyVar);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.fc4
    public void d(ky kyVar) {
        switch (this.d) {
            case 0:
                ((b2) this.e).o();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my(Object obj, boolean z, int i) {
        super(true);
        this.d = i;
        this.e = obj;
    }
}
