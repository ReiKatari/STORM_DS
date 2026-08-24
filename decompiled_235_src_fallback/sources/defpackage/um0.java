package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: um0  reason: default package */
/* loaded from: classes.dex */
public final class um0 extends defpackage.l {
    public final /* synthetic */ int l;

    public /* synthetic */ um0(int r1) {
            r0 = this;
            r0.l = r1
            r0.<init>()
            return
    }

    @Override // defpackage.l
    public final void i(defpackage.j36 r8, java.lang.Object r9) {
            r7 = this;
            int r7 = r7.l
            r0 = 3
            r1 = 2
            r2 = 1
            switch(r7) {
                case 0: goto L44;
                case 1: goto L1c;
                default: goto L8;
            }
        L8:
            ab5 r9 = (defpackage.ab5) r9
            r8.getClass()
            r9.getClass()
            long r3 = r9.a
            r8.c(r2, r3)
            boolean r7 = r9.c
            long r2 = (long) r7
            r8.c(r1, r2)
            return
        L1c:
            ea5 r9 = (defpackage.ea5) r9
            r8.getClass()
            r9.getClass()
            long r3 = r9.a
            r8.c(r2, r3)
            java.lang.String r7 = r9.b
            if (r7 != 0) goto L31
            r8.f(r1)
            goto L34
        L31:
            r8.w(r1, r7)
        L34:
            java.lang.String r7 = r9.c
            r8.w(r0, r7)
            r7 = 4
            java.lang.String r9 = r9.d
            r8.w(r7, r9)
            r7 = 5
            r8.c(r7, r3)
            return
        L44:
            io0 r9 = (defpackage.io0) r9
            r8.getClass()
            r9.getClass()
            long r3 = r9.a
            r8.c(r2, r3)
            boolean r7 = r9.b
            long r5 = (long) r7
            r8.c(r1, r5)
            r8.c(r0, r3)
            return
    }

    @Override // defpackage.l
    public final java.lang.String q() {
            r0 = this;
            int r0 = r0.l
            switch(r0) {
                case 0: goto Lb;
                case 1: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "DELETE FROM `ra_pending_achievement_award` WHERE `achievement_id` = ? AND `for_hardcore_mode` = ?"
            return r0
        L8:
            java.lang.String r0 = "UPDATE `ra_game` SET `game_id` = ?,`rich_presence_patch` = ?,`title` = ?,`icon` = ? WHERE `game_id` = ?"
            return r0
        Lb:
            java.lang.String r0 = "UPDATE OR ABORT `cheat` SET `id` = ?,`enabled` = ? WHERE `id` = ?"
            return r0
    }
}
