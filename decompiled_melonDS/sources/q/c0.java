package q;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        a6.d dVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                dVar = new a0.b(clipData, 3);
            } else {
                a6.e eVar = new a6.e();
                eVar.B = clipData;
                eVar.L = 3;
                dVar = eVar;
            }
            a6.x0.k(textView, dVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th2) {
            textView.endBatchEdit();
            throw th2;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        a6.d dVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            dVar = new a0.b(clipData, 3);
        } else {
            a6.e eVar = new a6.e();
            eVar.B = clipData;
            eVar.L = 3;
            dVar = eVar;
        }
        a6.x0.k(view, dVar.build());
        return true;
    }
}
