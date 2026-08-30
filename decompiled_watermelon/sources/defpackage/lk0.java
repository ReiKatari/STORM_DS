package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lk0  reason: default package */
/* loaded from: classes.dex */
public final class lk0 extends tq5 {
    public final /* synthetic */ int t;

    public /* synthetic */ lk0(int i) {
        this.t = i;
    }

    @Override // defpackage.tq5
    public final void f(ns5 ns5Var, Object obj) {
        switch (this.t) {
            case 0:
                am0 am0Var = (am0) obj;
                ns5Var.getClass();
                am0Var.getClass();
                long j = am0Var.a;
                ns5Var.g(1, j);
                ns5Var.g(2, am0Var.b ? 1L : 0L);
                ns5Var.g(3, j);
                return;
            case 1:
                u05 u05Var = (u05) obj;
                ns5Var.getClass();
                u05Var.getClass();
                long j2 = u05Var.a;
                ns5Var.g(1, j2);
                String str = u05Var.b;
                if (str == null) {
                    ns5Var.e(2);
                } else {
                    ns5Var.M(2, str);
                }
                ns5Var.M(3, u05Var.c);
                ns5Var.M(4, u05Var.d);
                ns5Var.g(5, j2);
                return;
            default:
                q15 q15Var = (q15) obj;
                ns5Var.getClass();
                q15Var.getClass();
                ns5Var.g(1, q15Var.a);
                ns5Var.g(2, q15Var.c ? 1L : 0L);
                return;
        }
    }

    @Override // defpackage.tq5
    public final String j() {
        switch (this.t) {
            case 0:
                return "UPDATE OR ABORT `cheat` SET `id` = ?,`enabled` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE `ra_game` SET `game_id` = ?,`rich_presence_patch` = ?,`title` = ?,`icon` = ? WHERE `game_id` = ?";
            default:
                return "DELETE FROM `ra_pending_achievement_award` WHERE `achievement_id` = ? AND `for_hardcore_mode` = ?";
        }
    }
}
