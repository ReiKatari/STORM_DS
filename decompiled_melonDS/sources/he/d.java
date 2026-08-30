package he;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends q8.r {

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ int f6461b0;

    public /* synthetic */ d(int i2) {
        this.f6461b0 = i2;
    }

    @Override // q8.r
    public final void j(t7.c cVar, Object obj) {
        switch (this.f6461b0) {
            case 0:
                ie.e eVar = (ie.e) obj;
                cVar.getClass();
                eVar.getClass();
                long j2 = eVar.f7055a;
                cVar.g(1, j2);
                cVar.g(2, eVar.f7056b ? 1L : 0L);
                cVar.g(3, j2);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                je.d dVar = (je.d) obj;
                cVar.getClass();
                dVar.getClass();
                long j10 = dVar.f7838a;
                cVar.g(1, j10);
                String str = dVar.f7839b;
                if (str == null) {
                    cVar.e(2);
                } else {
                    cVar.C(2, str);
                }
                cVar.C(3, dVar.f7840c);
                cVar.C(4, dVar.f7841d);
                cVar.g(5, j10);
                return;
            default:
                cVar.getClass();
                ((je.i) obj).getClass();
                cVar.g(1, 0L);
                cVar.g(2, 0);
                return;
        }
    }

    @Override // q8.r
    public final String t() {
        switch (this.f6461b0) {
            case 0:
                return "UPDATE OR ABORT `cheat` SET `id` = ?,`enabled` = ? WHERE `id` = ?";
            case DSiCameraSource.FrontCamera /* 1 */:
                return "UPDATE `ra_game` SET `game_id` = ?,`rich_presence_patch` = ?,`title` = ?,`icon` = ? WHERE `game_id` = ?";
            default:
                return "DELETE FROM `ra_pending_achievement_award` WHERE `achievement_id` = ? AND `for_hardcore_mode` = ?";
        }
    }
}
