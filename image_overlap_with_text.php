<?php
    $file1 = 'image2.jpg';
    $file2 = '0000.jpg';

    // First image
    $image = imagecreatefromjpeg($file1);

    // Second image (the overlay)
    $overlay = imagecreatefromjpeg($file2);

    // We need to know the width and height of the overlay
    list($width, $height, $type, $attr) = getimagesize($file2);

    // Apply the overlay
    imagecopy($image, $overlay, 0, 0, 0, 0, $width, $height);
    imagedestroy($overlay);
    
        
    //Add Text
    $cor = imagecolorallocate($image, 0, 0, 0);
    imagestring($image,5,126,22,"shakil",$cor);
    imagestring($image,5,226,32,"shakil",$cor);
    

    // Output the result to browser
    header('Content-type: image/jpeg');
    imagejpeg($image);
    
    
    //Save file to directory
    imagejpeg($image, "shakil.jpg"); 
    
    
    //Destroy the image used in php variable
    imagedestroy($image);

?>
