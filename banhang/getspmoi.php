<?php
include 'connect.php'; 

$query = "SELECT * FROM `sanphammoi` ORDER BY id DESC";
$data = mysqli_query($conn, $query); 

$result = array(); 

while ($row = mysqli_fetch_assoc($data)) {
    $result[] = $row; 
}

if (!empty($result)) {
    $arr = [
        'success' => true,
        'message' => 'Thành công',
        'result' => $result
    ];
} else {
    $arr = [
        'success' => false,
        'message' => 'Không có dữ liệu',
        'result' => $result
    ];
}

echo json_encode($arr);
?>
