package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: um0  reason: default package */
/* loaded from: classes.dex */
public final class um0 extends l {
    public final /* synthetic */ int l;

    @Override // defpackage.l
    public final void i(j36 j36Var, Object obj) {
        switch (this.l) {
            case 0:
                io0 io0Var = (io0) obj;
                j36Var.getClass();
                io0Var.getClass();
                long j = io0Var.a;
                j36Var.c(1, j);
                j36Var.c(2, io0Var.b ? 1L : 0L);
                j36Var.c(3, j);
                return;
            case 1:
                ea5 ea5Var = (ea5) obj;
                j36Var.getClass();
                ea5Var.getClass();
                long j2 = ea5Var.a;
                j36Var.c(1, j2);
                String str = ea5Var.b;
                if (str == null) {
                    j36Var.f(2);
                } else {
                    j36Var.w(2, str);
                }
                j36Var.w(3, ea5Var.c);
                j36Var.w(4, ea5Var.d);
                j36Var.c(5, j2);
                return;
            default:
                ab5 ab5Var = (ab5) obj;
                j36Var.getClass();
                ab5Var.getClass();
                j36Var.c(1, ab5Var.a);
                j36Var.c(2, ab5Var.c ? 1L : 0L);
                return;
        }
    }

    @Override // defpackage.l
    public final String q() {
        switch (this.l) {
            case 0:
                return "UPDATE OR ABORT `cheat` SET `id` = ?,`enabled` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE `ra_game` SET `game_id` = ?,`rich_presence_patch` = ?,`title` = ?,`icon` = ? WHERE `game_id` = ?";
            default:
                return "DELETE FROM `ra_pending_achievement_award` WHERE `achievement_id` = ? AND `for_hardcore_mode` = ?";
        }
    }
}
